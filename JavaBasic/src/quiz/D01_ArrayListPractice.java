package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D01_ArrayListPractice {	
	public static void main(String[] args) {

		
		//	# ArrayList拭 1000採斗 9999税 沓棋舛呪研 100鯵 蓄亜廃 板 陥製聖 姥背左室推. 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i <= 100; ++i) {
			list.add((int)(Math.random() * 9000) + 1000); 
		}
		System.out.println(list);

		//舛岩 熱戚
		//人 戚係惟 廃号拭 魁鎧澗姥蟹 せせせせせせせせせせ企酵
		int sum_ = 0;
		int min = list.get(0);
		int max = list.get(0);
		
		for(int num : list) {
			sum_ += 0;
			min = min > num ? num : min;
			max = max < num ? num : max;
		}
		
		System.out.println("汝液 : " + sum_ / (double) list.size());
		System.out.println("置企葵 : " + max);
		System.out.println("置社葵 : " + min);
		System.out.println("77腰属 葵 : " + list.get(76));
		
		
		
		//戚 購生稽澗 鎧 熱戚~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//	1. 乞窮 収切税 汝液
		int sum = 0;
		for(int num : list) {
			sum += num;
		}
		
		System.out.println("汝液 : " + sum);
		
		//	2. 乞窮 収切 掻 亜舌 笛 呪 
		int maxNum = list.get(0);
		for(int i = 0; i < list.size(); ++i) {
			maxNum = Math.max(maxNum, list.get(i));
		}
		System.out.println("置企葵 : " + maxNum);
		
		
		//	3. 乞窮 収切 掻 亜舌 拙精 呪 
		int minNum = list.get(0);
		for(int i = 0; i < list.size(); ++i) {
			minNum = Math.min(minNum, list.get(i));
		}
		System.out.println("置社葵 : " + minNum);
		
		
		//	4. 77腰属稽 蟹紳 呪 
		System.out.println("77腰属 葵 : " + list.get(76));
		
	
		// ----------------------------------------------------------------------------------------------------------------
		
		System.out.println("Collections稽 姥廃 置企葵 : " + Collections.max(list));
		System.out.println("Collections稽 姥廃 置社葵 : " + Collections.min(list));
		//Collection聖 含虞 梅澗汽 ArrayList澗 Collection税 切縦戚虞 級嬢哀 呪 赤製
		//衣経 : 焼澗 依戚 毘戚陥~~~~! 乞牽檎 壕伸 宜軒澗 暗壱, 硝檎 廃 匝稽 魁鎧澗 暗壱
		
		
		//壕伸聖 ArrayList稽 郊荷澗 号狛精? 赤聖猿? 
		
		//析舘 軒什闘研 壕伸稽 痕発馬澗 狛精 赤製
		//1. 葵聖 眼聖 壕伸聖 耕軒 持失背黍陥. 
		Integer[] arr = new Integer[list.size()]; //段奄鉢 照 背爽檎 神嫌害
		//int稽 馬檎 照 喫. Integer稽 背醤 喫!
		
		//2. toArray() 五辞球拭 耕軒 幻級嬢黍 壕伸聖 穿含廃陥. 
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//壕伸聖 軒什闘稽 痕発馬澗 狛
		//List<Integer> list = Arrays.asList(arr);
		//List展脊生稽 穣蝶什特 吉 依 
		System.out.println(list);
		
		//軒什闘稽 痕発吉 壕伸精 Collection戚奄 凶庚拭 陥獣 ArrayList稽 痕発拝 呪 赤陥. 
		list = new ArrayList<>(list); //陥獣 穣蝶什特 廃 依
		
		
		
		Collection<Integer> c = new ArrayList<>(list);
		List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		//ArrayList税 採乞昔 List税 採乞昔 Collection 
		//Collection , List, ArrayList 陥 績匂闘 背操虞 展脊耕什古帖 貝陥 
		
		
		//軒什闘稽 痕発廃 衣引研 呪舛
		//軒什闘稽 痕発廃 衣引研 呪舛背亀 据沙 壕伸拭澗 慎狽聖 耕帖走 省澗陥. new ArrayList馬檎辞 歯稽 幻級嬢 浬 暗艦猿(差紫廃 疾)
		for(int i = 0; i < l2.size(); ++i) {
			if (l2.get(i) > 1100) {
				l2.remove(i--); //幻鉦拭 走頗陥檎 --
			}
		}
		System.out.println(l2);
		System.out.println(Arrays.toString(arr)); //据沙 壕伸精 益企稽 赤革 
	
	}
}
