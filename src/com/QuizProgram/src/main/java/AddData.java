import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddData {
    public static void main(String[] args) throws IOException, ParseException {
        updateJSONList(2,"Answer","John");
    }

    public static void updateJSONList(int index, String key, String value) throws IOException, ParseException {
        String fileName="./src/main/resources/Questions.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        JSONObject jsonObject = (JSONObject) jsonArray.get(index);
        jsonObject.put(key, value);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
        System.out.println("Updated!");
        System.out.print(jsonArray);
    }

}
