/* Create a quiz program.
Scenario: Add 20 general knowledge question in a json file(you can add or remove data from the file). Generate 5 random questions from the
 saved question. Now input the correct answer. If ans is correct, count point 1 for each corrected ans. For each wrong ans, point is 0. After
 ending the quiz, show total point out of 5 questions.

 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddQuestions {
    public static void main(String[] args) throws IOException, ParseException {
        char ch = 'y';
        String fileName = "./src/main/resources/Questions.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject questionObj = new JSONObject();

            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Input Question No: ");
            questionObj.put("Question No", sc1.next());
            System.out.println("Input Question : ");
            questionObj.put("Question ", sc2.nextLine());
            System.out.println("Input Answer ");
            questionObj.put("Answer", sc2.nextLine());

            JSONArray jsonArray = (JSONArray) obj;
            jsonArray.add(questionObj);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");
            System.out.print(jsonArray);
            System.out.println("\nDo you want to add more?[y/n]");
            ch = sc1.next().charAt(0);

        }
        while (ch != 'n');

    }
}







