import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        /*
            조건
            1. 0 <= arr[n] 원소 <= 9
            2. 중복 제거
            3. 순서 유지
            풀이방법
            1. 새로운 리스트 변수 distinctList 생성 -> 리스트는 넣는 순서대로 유지?
            2. for문을 돌려 distinctList에 arr 값을 하나씩 넣어준다.
            3. 만약 distinctList의 마지막값과 같은 arr값이라면 넣지않음
            다른사람풀이
            1. list.get(0)에 arr[0]의 값을 넣어주면 코드가  더 깔끔해진다.
            -> if로 사이즈 체크를 안해줘도 됨
            2. temp 변수를 10으로 선언(0-9까지 배정되니까나 겹칠일이 없음)하여
            list에 add 할 때 temp값을 arr[i]로 바꿔 비교하면 더 깔끔해진다.
            스택
            1. 스택은 선입후출이다. java의 스택을 이용하여 풀면 첫값은 바로 넣어주고 그다음부터 꺼                낼때 스택의 개념으로 마지막값이 나오니깐 더 간편하게 풀 수 있다.
        */
                
        List<Integer> distinctList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(distinctList.size() > 0){
                if(distinctList.get(distinctList.size()-1) != arr[i]){
                    distinctList.add(arr[i]);
                }    
            }else{
                 distinctList.add(arr[i]);
            }                         
        }
        
        int[] answer = new int [distinctList.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = distinctList.get(i);
        }
        
        
        return answer;
    }
}