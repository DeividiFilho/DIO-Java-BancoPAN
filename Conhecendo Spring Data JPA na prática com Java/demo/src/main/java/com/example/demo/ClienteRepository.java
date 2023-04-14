@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @RunWith(SpringRunner.class)
    @DataJpaTest
    public class ClienteRepositoryTest {

        @Autowired
        private TestEntityManager entityManager;

        @Autowired
        private ClienteRepository clienteRepository;

        @Test
        public void whenFindById_thenReturnCliente() {
            // given
            Cliente cliente = new Cliente("João", 25, 75.5, 1.75, null);
            entityManager.persist(cliente);
            entityManager.flush();

            // when
            Optional<Cliente> found = clienteRepository.findById(cliente.getId());

            // then
            assertThat(found.isPresent()).isTrue();
            assertThat(found.get().getNome()).isEqualTo(cliente.getNome());
            assertThat(found.get().getIdade()).isEqualTo(cliente.getIdade());
            assertThat(found.get().getPeso()).isEqualTo(cliente.getPeso());
            assertThat(found.get().getAltura()).isEqualTo(cliente.getAltura());
        }

        @Test
        public void whenSave_thenClienteIsPersisted() {
            // given
            Cliente cliente = new Cliente("Maria", 30, 60.0, 1.65, null);

            // when
            clienteRepository.save(cliente);

            // then
            assertThat(entityManager.find(Cliente.class, cliente.getId())).isNotNull();
        }
    }

}
