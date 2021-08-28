package com.smoothhunger.donate.seeders;

import com.smoothhunger.donate.services.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ProducePluSeeder {
    private final ProduceService produceService;

    @Autowired
    public ProducePluSeeder(ProduceService produceService){
        this.produceService = produceService;
    }

    public void run(String... args) throws Exception{
        if(produceService.count() <= 0){
            System.out.println("here");
            List<List<String>> records = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File("src/main/resources/plu.csv"));) {
                while (scanner.hasNextLine()) {
                    records.add(getRecordFromLine(scanner.nextLine()));
                }
                System.out.println(records.get(1));
        }
//            for(List<String> produceItem : records){
//                for(int i = 0; i <= 14; i++){
//
//                }
//            }
    }

}

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter("COMMA_DELIMITER");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
