package _03_array;

//표준 배열

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Arrays;

//배열
// - 배열에 저장할 자료형을 선언, 배열이름과 크기를 선언해야 함.
// - 배열의 원소는 모두 같은 타입
// - 처음 선언한 배열 크기는 변경 불가능
// - 처음 선언한 배열 크기는 변경 불가능( 단 , ArrayList 컬렉션의 경우, 동적 크기 조절 가능)
public class ArrayEx {
    public static void main(String[] args) {
        //배열 변수 선언
        // - 두가지 방법이 있음.
        //1. type[] variable;
        int[] arr1;
        //2. type variable[];
        int arr2[];

        // - 배열 변수는 "참조 변수"
        // - 따라서, 참조할 배열이 없다면 null로 초기화 가능
        // ex. 타입[] 변수 = null;
        String[] temp = null;
        System.out.println("temp = "+temp); // 출력 : null
        //System.out.println("temp[0] = "+ temp[0]); // 출력 : NullPointerException
        // -> 배열 변수가 null인 상태에서 index에 접근하려 하기 때문.

        // # 값 목록으로 배열 변수 선언하고 배열 생성
        //- 중괄호({})는 나열된 값들을 항목으로 가지는 배열을 "힙 메모리 영역"에 생성하고, "번지"를 리턴.
        //- 배열 변수는 "리턴된 번지수"를 저장함으로써 참조가 이루어진다.
        int[] intArray = {16,22,34,56,75};
        System.out.println("intArray[0] = "+ intArray[0]);
        System.out.println("intArray[1] = "+ intArray[1]);
        System.out.println("intArray[2] = "+ intArray[2]);
        System.out.println("intArray = "+ intArray); // 참조값 저장

        intArray[1] = 77;
        System.out.println("intArray[1] = "+ intArray[1]);

        //주의 : 중괄호로 감싼 목록을 배열 변수에 대입할 때.
        //배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다.
//        char[] charArray;
//        charArray = {'A','B','C'}; //컴파일 에러 발생!
        char[] charArray;
        charArray = new char[]{'A','B','C'};

        System.out.println("charArray[0] = "+charArray[0]);
        System.out.println("charArray[1] = "+charArray[1]);
        System.out.println("charArray[2] = "+charArray[2]);

        // new 연산자로 배열 선언, 배열 생성
        // new 연산자로 생성하면 배열 항목은 기본 값으로 초기화된다.
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화된 값 : "+ doubleArray[0]+" " + doubleArray[1] +" "+ doubleArray[2]);
        doubleArray[0] = 0.1;
        doubleArray[1] = 2.4;
        doubleArray[2] = 1.8;
        System.out.println("doubleArray[0] = "+ doubleArray[0]);
        System.out.println("doubleArray[1] = "+ doubleArray[1]);
        System.out.println("doubleArray[2] = "+ doubleArray[2]);

        //////////////////////////////////////////////////////
        //배열 길이
        //문법) 배열 변수, length
        //-length 필드는 read-only로, 수정 불가능.
        System.out.println("doubleArray 배열 길이  : "+doubleArray.length);
        //배열 길이는 반복문에서 자주 사용됨.
        //총합, 평균 구할 때.
        int sum = 0;
        for(int i=0; i< intArray.length;i++){
            sum += intArray[i];
        }
        System.out.println("sum = "+sum);
        double avg = (double) sum /intArray.length ;
        System.out.println("avg = " +avg);


        //- 만약 배열의 길이를 벗어난다면?
//        System.out.println(doubleArray[doubleArray.length]); //ArrayIndexOutOfBoundsException

        //배열(원소) 출력
        // - Arrays 클래스에 내장된 toString() 메서드를 활용.
        // - 배열의 참조값, 주소값이 아닌, 배열 원소값을 모두 보고 싶을 때.
        System.out.println("intArray : "+ Arrays.toString(intArray));
        System.out.println("charArray : "+ Arrays.toString(charArray));
        System.out.println("doubleArray : "+ Arrays.toString(doubleArray));

        ////////////////////////////////////////////////////
        // 다차원 배열
        // - 배열 안의 배열 안의 배열 안의 ...
        //case 1. 2*3 배열 생성 및 초기화
        int[][] matrix ={{1,2,3},{4,5,6}};

        //case 2. 3*2 배열 생성 및 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        //case3. 3차원 배열
        int [][][] threeDimensionalArray ={{{1,2},{3,4}},{{5,6}, {7,8}}};

        System.out.println("Matrix1");
        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix2");
        for(int i = 0; i<matrix2.length; i++){
            for (int j = 0; j<matrix2[i].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("threeDimensionalArray");
        for(int i = 0; i<threeDimensionalArray.length;i++){
            for(int j = 0;j<threeDimensionalArray[i].length;j++){
                for(int k= 0;k<threeDimensionalArray[i][j].length;k++){
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        ////////////////////////////////////////////////
        //객체를 참조하는 배열
        // - 기본 타입 배열 원소(각 항목)에 값을 직접 저장
        // - 참조 타입(클래스, 인터페이스) 배열은 원소(각 항목)에 객체의 번지를 저장한다.
        String[] langs = new String[3];
        langs[0] = "Java";
        langs[1] = "Java";
        langs[2] = new String("Java");

        System.out.println("langs = " + Arrays.toString(langs));
        System.out.println(langs[0] == langs[1]); //true : 같은 참조를 가지고 있음.
        System.out.println(langs[1] == langs[2]); //false : 다른 객체를 참조하고 있음.
        System.out.println(langs[1].equals(langs[2]));
        System.out.println();
        ///////////////////////////////////
        // 배열 복사
        // - 배열은 크기가 "고정"되어 있다.
        // - > 더 많은 저장 공간이 필요하다면 더 큰 길이의 배열을 새로 만들어 기존 배열을 복사해야 함.

        // ver1. 반복문으로 요소 하나씩 복사-> 기억하기 쉽고 복잡함
        int[] originArr = {1,2,3};
        int[] newArr = new int[5]; // 0으로 초기화된다!
        System.out.println("originArr = "+ Arrays.toString(originArr));

        for(int i = 0; i<originArr.length; i++){//배열 복사
            newArr[i] = originArr[i];
        }
        System.out.println("newArr = "+Arrays.toString(newArr));

        //ver2. arraycopy() 이용 -> 기억하기 어렵고 간단함
        // : System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // - Object src : 원본배열
        // - int srcPos : 원본배열의 어디 인덱스부터 복사할까?
        // - Object dest : 새로운 배열
        // - int destPos : 새로운 배열의 붙여넣기 시작 인덱스
        // - int length : 복사 항목 수
        String[] originFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

        System.arraycopy(originFruits, 1, newFruits,2, originFruits.length - 1);
        System.out.println("originFruits : "+Arrays.toString(originFruits));
        System.out.println("newFruits : "+Arrays.toString(newFruits));
    //////////////////////////////////////////////////////////////////////////
        // Arrays 메소드
        // 1.copyOf(arr, copyArrayLength) 메소드 => 복사를 수행함. 대신 처음부터만 함.
        int[] originIntArr = {1,2,3,4,5};
        int[] copiedIntArr = Arrays.copyOf(originIntArr, 3);
        System.out.println("originIntArr = "+Arrays.toString(originIntArr));
        System.out.println("copiedIntArr = "+Arrays.toString(copiedIntArr));

        //2.copyOfRange(arr,a,b) =>arr의 a인덱스 부터 b인덱스 전까지 복사함. b-a개가 복사된다!
        int[] rangeArr = Arrays.copyOfRange(originIntArr, 1,4);
        System.out.println("rangeArr = "+ Arrays.toString(rangeArr));

        //3. fill(arr, n) 메소드 -> 채워줌!
        int[] filledArr = new int[5];
        System.out.println("Filled Array (before) = " + Arrays.toString(filledArr));
        Arrays.fill(filledArr, 7); // 특정 값으로 다 채워줄 수 있다!
        System.out.println("Filled Array (after) = " + Arrays.toString(filledArr));

        //4. sort(arr) 메소드
        int[] unsortedArr = {6, 4, 9, 5, 1};
        Arrays.sort(unsortedArr);
        System.out.println("sorted Array = "+ Arrays.toString(unsortedArr));

        //5. equals() 메소드 -> 다차원 배열에서는 equals만 쓰면 안된다. 어차피 다 참조값으로 이뤄져 있으니깐!
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {4,2,3};
        boolean arraysEqual12 = Arrays.equals(array1,array2);
        System.out.println("arraysEqual(1 vs 2) : "+ arraysEqual12);
        boolean arraysEqual13 = Arrays.equals(array1,array3);
        System.out.println("arraysEqual(1 vs 3) : "+ arraysEqual13);

        //참고 : ==(비교연산자)를 쓰면?? : 참조값을 비교하는 상황임. 의미없음.
        System.out.println("Arrays == (1 vs 2) : "+ (array1 == array2)); //false
        System.out.println("Arrays == (1 vs 3) : "+ (array1 == array3)); //false

        //6. deepEquals(arr1,arr2) : 다차원 배열의 내용 비교
        int[][] deepArray1 = {{1,2},{3,4}};
        int[][] deepArray2 = {{1,2},{3,4}};
        int[][] deepArray3 = {{1,2},{3,5}};
        boolean deepArraysEqual12 = Arrays.deepEquals(deepArray1,deepArray2);
        boolean deepArraysEqual13 = Arrays.deepEquals(deepArray1,deepArray3);
        System.out.println("deepArraysEqual(1vs2) : "+deepArraysEqual12);
        System.out.println("deepArraysEqual(1vs3) : "+deepArraysEqual13);

        //7. binarySearch(arr,val) : arr 배열에서 val값의 index를 찾음. (단, 배열이 정렬된 상태여야 함. 이진 탐색의 기본조건.)
        int[] sortedArray = {10,30,50,70,90,110,130,150};
        int index = Arrays.binarySearch(sortedArray,70);
        System.out.println("index of 70 = " + index);
    }

}
