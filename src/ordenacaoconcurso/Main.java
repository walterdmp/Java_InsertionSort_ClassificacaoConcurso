package ordenacaoconcurso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Candidato> carregarCSV(String filePath) {
        List<Candidato> candidatos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String[] v = line.split(",");
                int id = Integer.parseInt(v[0]);
                String nome = v[1];
                LocalDate dataNasc = LocalDate.parse(v[2], formatter);
                int nota = Integer.parseInt(v[3]);

                candidatos.add(new Candidato(id, nome, dataNasc, nota));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidatos;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Walter\\Downloads/dadosConcurso.csv";
        List<Candidato> candidatos = carregarCSV(filePath);

        InsertionSort iSort = new InsertionSort();
        Candidato[] vetC = new Candidato[candidatos.size()];
        vetC = candidatos.toArray(vetC);
        iSort.sort(vetC);
        
        int cont = 1;
        
        for (Candidato c : vetC) {
            System.out.println(cont + "° lugar: " + c);
            cont++;
        }
    }
}
