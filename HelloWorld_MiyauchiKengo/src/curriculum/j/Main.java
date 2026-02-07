package curriculum.j;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		// ① Billable型のリスト
		List<Billable> employees = new ArrayList();
		
		// ② 追加（型は違うがOK）
		employees.add(new FullTimeEmployee("F001", "山田"));
		employees.add(new ContractEmployee("F001", "佐藤"));
		employees.add(new FullTimeEmployee("F002", "田中"));
		
		// ③ for-eachで処理
		for (Billable emp : employees) {
			
			int wage = emp.costForDay(9);
			
			System.out.println("日給: " + wage + " 円");
		}
	}

}
