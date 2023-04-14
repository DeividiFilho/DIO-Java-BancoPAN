@RestController
@RequestMapping("/treinos")
public class TreinoController {

    @Autowired
    private TreinoRepository treinoRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Treino> buscarPorId(@PathVariable Long id) {
        Optional<Treino> treino = treinoRepository.findById(id);
        if (treino.isPresent()) {
            return ResponseEntity.ok(treino.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Treino adicionar(@RequestBody Treino treino) {
        return treinoRepository.save(treino);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Treino> atualizar(@PathVariable Long id, @RequestBody Treino treinoAtualizado) {
        Optional<Treino> treino = treinoRepository.findById(id);
        if (treino.isPresent()) {
            treinoAtualizado.setId(id);
            return ResponseEntity.ok(treinoRepository.save(treinoAtualizado));
        }
        return ResponseEntity.notFound().build();
