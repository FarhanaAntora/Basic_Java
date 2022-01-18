import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GenerateQuestions {
    public static void main(String[] args) throws IOException, ParseException {
        randomQuestions();
    }

    public static void randomQuestions() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        String fileName = "./src/main/resources/Questions.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        int point = 0;

        for (int i = 1; i <= 5; i++) {
            Random random = new Random();
            int a = random.nextInt(jsonArray.size());
            System.out.println("Question No. and Answer");
            System.out.println(a);
            JSONObject object = (JSONObject) jsonArray.get(a);
            String s = (String) object.get("Answer");
            System.out.println(s);

            if (s.equals(sc.nextLine())) {
                System.out.println("Correct Answer");
                point++;
            } else {
                System.out.println("Wrong Answer");
            }

        }
        System.out.println("Total Point "+ point);

    }
}

