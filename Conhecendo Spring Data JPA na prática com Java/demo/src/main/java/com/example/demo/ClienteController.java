@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            clienteAtualizado.setId(id);
            return ResponseEntity.ok(clienteRepository.save(clienteAtualizado));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @RunWith(SpringRunner.class)
    @WebMvcTest(controllers = ClienteController.class)
    public class ClienteControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private ClienteRepository clienteRepository;

        @Test
        public void whenFindAll_thenReturnJsonArray() throws Exception {
            // given
            Cliente cliente1 = new Cliente("João", 25, 75.5, 1.75, null);
            Cliente cliente2 = new Cliente("Maria", 30, 60.0, 1.65, null);
            List<Cliente> clientes = Arrays.asList(cliente1, cliente2);

            given(clienteRepository.findAll()).willReturn(clientes);

            // when
            mockMvc.perform(get("/clientes"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                    .andExpect(jsonPath("$", hasSize(2)))
                    .andExpect(jsonPath("$[0].nome", is(cliente1.getNome())))
                    .andExpect(jsonPath("$[1].nome", is(cliente2.getNome())));
        }

        @Test
        public void whenFindById_thenReturnJson() throws Exception {
            // given
            Cliente cliente = new Cliente("João", 25, 75.5, 1.75, null);

            given(clienteRepository.findById(1L)).willReturn(Optional.of(cliente));

            // when
            mockMvc.perform(get("/clientes/1"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                    .andExpect(jsonPath("$.nome", is(cliente.getNome())))
                    .andExpect(jsonPath("$.idade", is(cliente.getIdade())))
                    .andExpect(jsonPath("$.peso", is(cliente.getPeso())))
                    .andExpect(jsonPath("$.altura", is(cliente.getAltura())));
        }
    }

}
