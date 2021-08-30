package com.smoothhunger.donate.seeders;

import com.smoothhunger.donate.models.Produce;
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
            ArrayList<List<String>> records = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File("src/main/resources/plu.csv"));) {
                while (scanner.hasNextLine()) {
                    List<String> parsedData = getRecordFromLine(scanner.nextLine());
                    records.add(parsedData);
                }
        }

                for(int i = 0; i <= records.size()-1; i++){
                    List<String> produceItemInfo = records.get(i);
                    Produce produceToBePersistedInDb = new Produce();
                    System.out.println(produceItemInfo+"<------THIS IS THE ITEM");
                    produceToBePersistedInDb.setPlu(produceItemInfo.get(0));
                    produceToBePersistedInDb.setCategory(produceItemInfo.get(1));
                    produceToBePersistedInDb.setCommodity(produceItemInfo.get(2));
                    produceToBePersistedInDb.setVariety(produceItemInfo.get(3));
                    produceToBePersistedInDb.setSize(produceItemInfo.get(4));
                    produceToBePersistedInDb.setMeasurementsNa(produceItemInfo.get(5));
                    produceToBePersistedInDb.setMeasurementsGlobal(produceItemInfo.get(6));
                    produceToBePersistedInDb.setRestrictionsNotes(produceItemInfo.get(7));
                    produceToBePersistedInDb.setBotanicalName(produceItemInfo.get(8));
                    produceToBePersistedInDb.setAka(produceItemInfo.get(9));
                    produceToBePersistedInDb.setNotes(produceItemInfo.get(10));
                    produceToBePersistedInDb.setRevisionDate(produceItemInfo.get(11));
                    produceToBePersistedInDb.setDateAdded(produceItemInfo.get(12));
                    produceToBePersistedInDb.setGpc(produceItemInfo.get(13));
                    produceToBePersistedInDb.setImage(produceItemInfo.get(14));
                    produceToBePersistedInDb.setImageSource(produceItemInfo.get(15));
                    produceService.save(produceToBePersistedInDb);
                }
    }

}

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter("[,\n]");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
