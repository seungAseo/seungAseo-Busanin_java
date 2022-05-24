package test;

import java.util.Scanner;

public class GBBWithComputers {

	public static void main(String[] args) {
		String[] com1 = {"가위", "바위", "보"};
		String[] com2 = {"가위", "바위", "보"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.nextLine();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			int n = (int)(Math.random()*3);	
			
			// (((1))) 사용자가 가위 + 컴퓨터1이 가위
			if(user.equals("가위")) {
				if(com1[n].equals("가위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 비겼습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터2가 이겼습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터2가 졌습니다.");
					}
				}
				// 사용자가 가위 + 컴퓨터1이 바위						
				else if(com1[n].equals("바위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터1이 이겼습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 졌습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 다시 가위, 바위, 보 하세요.");	
					}
			    }
				// 사용자가 가위 + 컴퓨터1이 보						
				else if(com1[n].equals("바위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터1이 이겼습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 졌습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 가위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 이겼습니다.");	
					}
			   }
			   
			}
			// (((2)))사용자가 바위 + 컴퓨터1이 가위
			else if(user.equals("바위")) {
				if(com1[n].equals("가위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 이겼습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터1이 졌습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 다시 가위, 바위, 보 하세요.");
					}
				}
				// 사용자가 바위 + 컴퓨터1이 바위						
				else if(com1[n].equals("바위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터2가 졌습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 비겼습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터2가 이겼습니다.");	
					}
			    }
				// 사용자가 바위 + 컴퓨터1이 보						
				else if(com1[n].equals("보")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 다시 가위, 바위, 보 하세요.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터1이 이겼습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 바위" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 졌습니다.");	
					}
			   }
			   
			} 
						
		    // (((3))) 사용자가 보 + 컴퓨터1이 가위
			else if(user.equals("보")) {
				if(com1[n].equals("가위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 졌습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 다시 가위, 바위, 보 하세요.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터1이 이겼습니다.");
					}
				}
				// 사용자가 보 + 컴퓨터1이 바위						
				else if(com1[n].equals("바위")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 다시 가위, 바위, 보 하세요.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 사용자가 이겼습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터1이 졌습니다.");	
					}
			    }
				// 사용자가 보 + 컴퓨터1이 보						
				else if(com1[n].equals("보")) {
					if(com2[n].equals("가위")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터2가 이겼습니다.");
					} else if(com2[n].equals("바위")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 컴퓨터2가 졌습니다.");
					} else if(com2[n].equals("보")) {
						System.out.println("사용자 = 보" + ", 컴퓨터1 = " + com1[n]
								+", 컴퓨터2 = " + com2[n] + ", 비겼습니다.");	
					}
			   }
			   
			} 
			else { 
				System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
			}
		}
			scanner.close();
		}
}
