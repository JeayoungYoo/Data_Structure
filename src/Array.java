import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        /*
        Integer[][][] data_list = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

// 데이터 5 인덱스로 지정해서 출력해보기
        System.out.println( data_list[0][1][1] );
// 데이터 12 인덱스로 지정해서 출력해보기
        System.out.println( data_list[1][1][2] );

//연습해보기1
//
//위 3차원 배열에서 8, 10, 2 를 순서대로 각각의 라인에 출력해보기 (System.out.println 사용)
//처음이라 쉽습니다. 처음에는 매우 쉽지만, 후반부는 충분히 어렵습니다.
//쉬운 부분을 잘 쌓아나가야 어려운 부분을 잘 할 수 있습니다.
        System.out.println(data_list[1][0][1]);
        System.out.println(data_list[1][1][0]);
        System.out.println(data_list[0][0][1]);
*/
        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

//        연습해보기2
//
//위 1차원 배열에서, 문자 M 을 가지고 있는 아이템의 수를 출력해보기
//참고
//배열.length : 배열에 들어 있는 아이템 갯수
//문자열.indexof(String key) : 문자 key 가 해당 문자열에 있으면 해당 문자의 위치 (index 값) 를 리턴하고, 없으면 -1 을 리턴함
        int cnt = 0;

        for (int i =0; i<dataset.length; i++) {
            if (dataset[i].indexOf("M") > 0) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
