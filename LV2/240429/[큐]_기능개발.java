import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        /*
            선입선출 큐
            
            조건
            1. 앞에 기능들이 모두 완료되어야 뒤에 완료된 기능도 배포 가능
        */
      
        Queue<Integer> restPeriod = new LinkedList<>();
        List<Integer> distribution = new LinkedList<>();        
        int cnt = 0;
        
        for(int i=0; i<progresses.length; i++){    
            if(((100-progresses[i])%speeds[i]) == 0) {
                restPeriod.offer((100 - progresses[i])/speeds[i]);
            }else{
                restPeriod.offer(((100 - progresses[i])/speeds[i])+1);
            }    
        }
        
        int temp = restPeriod.peek();
        int size = restPeriod.size();
        
        for(int i=0; i<size; i++){     
            if(restPeriod.size() == 1) {
                if(temp >= restPeriod.peek()){
                    cnt++;
                    distribution.add(cnt);  
                } else{
                    distribution.add(cnt);  
                    distribution.add(1);  
                }
                
            }
            else{
                if(temp >= restPeriod.peek()){
                    cnt++;
                    restPeriod.poll();    
                } else if(temp < restPeriod.peek()){
                    temp = restPeriod.poll();
                    distribution.add(cnt);
                    cnt = 1;
                }

            }
            
        }            
        return distribution;
    }
}