package coding.challenges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        Integer numberOfStrings = in.nextInt();

        List<String> strings = new ArrayList<String>(numberOfStrings);

        for (int i = 0; i< numberOfStrings; ++i) {
            strings.add(in.next());
        }

        Integer numberOfQueries = in.nextInt();

        List<String> queries = new ArrayList<String>(numberOfQueries);

        for (int i = 0; i< numberOfQueries; ++i) {
            queries.add(in.next());
        }

        in.close();

        for(String q : queries) {
            int count = 0;

            for (String s : strings) {
                if (q.equals(s)) {
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
