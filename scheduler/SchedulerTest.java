package scheduler;

import java.io.IOException; // System.in.read 에 대한 명령어를 쓰기 위한 것

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		System.out.println("A : 상담원이 필요할 때 가져갈 수 있게 할당 ");
		
		int ch = System.in.read(); // 할당 방식을 입력 받아 ch 변수에 대입 (즉 R, L, P를 입력)
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		
		else if (ch == 'L' || ch =='l') {
			scheduler = new LeastJob();
		}
		
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		
		else if (ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		
		else {
			System.out.println("지원되지 않은 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
