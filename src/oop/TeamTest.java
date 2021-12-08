package oop;

public class TeamTest {

	public static void main(String[] args) {
		// 한국 선수 객체 생성
		Player kim	= new Player("Kim", new int[] { 9, 8, 10 });
		Player lee 	= new Player("Lee", new int[] { 9, 8, 10 });
		Player park = new Player("Park", new int[] { 9, 8, 10 });

		// 한국 선수 객체 생성
		Player xi  = new Player("Xiao", new int[] { 8, 8, 10 });
		Player yu  = new Player("Yu", new int[] { 9, 8, 9 });
		Player xui = new Player("Xui", new int[] { 8, 8, 10 });
		
		// 객체 배열 만들기
		Player[] koreaPlayers = { kim, lee, park };
		Player[] chinaPlayers = { xi, yu, xui };
		
		// 팀 객체 생성
		Team korea = new Team("KOREA", koreaPlayers);
		Team china = new Team("CHINA", chinaPlayers);
		
		// 팀 점수 출력
		korea.printTeamPoints();
		china.printTeamPoints();
		
	} // end of main
} // end of TeamTest

// 팀 클래스 
class Team {
	// 필드
	String nation;		// 나라
	Player[] players;	// 선수들
	
	// 생성자
	Team (String str, Player[] arr) {
		nation = str;
		players = arr;
	}
	
	// 메소드
	void printTeamPoints() {
		int sum = 0;
		for (int i = 0; i < players.length; i++) {
			sum += players[i].totalPoints();
		}
		System.out.printf("%s -> %d points\n", nation, sum);
		
	} // end of printTeamPoints
} // end of Team