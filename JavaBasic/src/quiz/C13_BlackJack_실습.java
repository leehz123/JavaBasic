package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.BlackJack_실습용.Cards;
import myobj.BlackJack_실습용.Players;

//추상클래쓰 꼭 안 ㅆ써도 됨(어렵댕)
/*
블랙잭을 만들어보세요 
딜러에게 카드를 한장씩 받아 21에 가까운 수를 만드는 사람이 이기며 21을 초과하면 지는 게임.
10에 해당되는 카드 10, J, Q, K

1. 컴퓨터(딜러) 와 사람(플레이어) 이 카드를 뽑는다. 
2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다. 
3. 플레이어는 상황을 보고 더 뽑을지(hit) 여기서 멈출지(stand) 결정할 수 있다.
4. 플레이어가 멈추면 딜러가 가려져 있던 카드를 오픈하고 규칙에 따라 카드를 계속 뽑는다.
   딜러는 반드시 가지고 있는 카드 합이 16 이하일 때 무조건 뽑고 17 이상이면 무조건 멈춘다. 
   
5. 플레이어의 카드 합이 딜러보다 높으면 승리. 
	플레이어의 카드 합이 정확하게 21이면 만들 수 있는 최대값이므로 더 뽑지 않는다. 
	플레이어의 카드 합이 21보다 크면 (버스트) 패배. 
6. A는 1로 쓸 수 있고 11로 쓸 수도 있다.
참고자료 https://www.247blackjack.com/
7. 여유가 되면 플레이어가 돈을 버는것까지 ㅋ..

어 근데 숫자가 같을 떄도 있어야 하는 거 아님? 19 : 19 는 push나오네  (일단 push생각 안 하는 걸로?)
 */

public class C13_BlackJack_실습 {
	
	Players[] player = new Players[2]; //0번 인덱스는 사용자, 1번 인덱스는 딜러
	//그니까 맨 첨에 딜 한번 하고 그 딜한 결과를 player[0]에 집어넣고 그걸 dealer의 편에 보여주고 
	// 그 담에 딜 한번 하고 그 딜한 결과를 player[1]에 집어넣고 그걸 dealer의 편에 보여주고
	//그 담에 사용자가 hit 과 stand중에 hit고르면 hit한 카드를 보여주고 cardsSum에 합해서 카드들의 합을 보여주고 
	//만약에 stand하면 dealer가 cardsSum이 16이하인 동안 hit을 계속 하고 
	
	public static void main(String[] args) {
		
		game();	
		
					
	}
	
	static void game() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : 게임 시작 \n2 : 게임 종료");
			System.out.print("번호를 입력하시오 >> ");
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("GAME START");
				break;
			}
			System.out.println("GAME OVER");
			return;
		}
		
		Cards cards1 = new Cards(); //사용자
		Cards cards2 = new Cards(); //딜러
	
		cards1.deal();
		cards2.deal();
		
		//딜에서 블랙잭이 나왔을 경우 승패 알리고 프로그램 종료
		cards1.dealCardsSum();
		cards2.dealCardsSum();
		
		
		System.out.print("플레이어 의 카드 : " + cards1 + "\t");
		System.out.println("플레이어의 카드 합 : " + cards1.cardsSum);
		System.out.print("딜러 의 카드 : " + cards2 + "\t");
		System.out.println("딜러의 카드 합 : " + cards2.cardsSum);
		
		cards1.playerJudge();
		cards2.playerJudge();
		
		while(true) {
			System.out.println("1 : hit\n2:stand");
			System.out.print("번호를 입력하시오 >> ");
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("플레이어의 카드를 뽑습니다...");
				cards1.hit();
				
				//cards1.aToOne();
				cards1.playerJudge();
				
			} else if(input == 2) {
				while(true) {
					System.out.println("딜러가 카드를 뽑습니다...");
					cards2.hit();
					
					//cards2.aToOne();
					cards2.dealerJudge();
					if(cards2.cardsSum >= 17) {
						break;
					}
				}
			} else if(input > 2 || input < 1) {
				System.out.println("입력 오류. 1 과 2 중에서 번호를 다시 입력해주세요. ");
			}
		}
		
	}
	
	static void test() { //아니 이거 왜 스태틱 써줘야 하지?
		Cards cards = new Cards();
		
		System.out.println("랜덤카드 뽑기 테스트용 :  " + cards.randomCard()); //랜덤카드 뽑기
		System.out.println("딜 했을 때 카드 두장 뽑기 : " + Arrays.toString(cards.deal())); //딜 했을 때 두 장 뽑기
		
		
		System.out.println("딜 했을 때 뽑은 카드가 cardList에 제대로 저장 됐는지 : " + Arrays.toString(cards.cardsList)); //카드리스트에 제대로 저장 됐는지 확인 
		System.out.println("딜 할 때 마지막으로 뽑은 랜덤카드가 randomCard변수에 잘 저장 됐는지 : " + cards.randomCard);
		
		System.out.println("문자를 숫자로 바꾸는 메서드가 잘 동작하는지 : " + cards.convertToNum(cards.randomCard));
		
		System.out.println("deal cards의 합 : " + cards.dealCardsSum()); //딜카드의 수만 합한 것.
		System.out.println("deal cards의 합이 cardsSum에 1차적으로 잘 저장 됐는지 : " + cards.cardsSum);
		
		System.out.println();
		System.out.println("hit했을 떄 새로 추가된 카드와 총 카드의 합 : ");
		cards.hit(); 
	}


}








