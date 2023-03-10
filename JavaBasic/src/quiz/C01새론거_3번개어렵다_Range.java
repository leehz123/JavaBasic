package quiz;

import java.util.Arrays;

/*
#五辞球 神獄稽漁 Method Overloading
切郊拭辞澗 旭精 戚硯税 五辞球研 食君 鯵 識情拝 呪 赤陥.
戚硯戚 旭精 五辞球食亀 古鯵痕呪税 展脊 暁澗 鯵呪亜 陥牽陥檎 陥献 五辞球稽 昔縦吉陥.  
(焼猿 梅揮 依亀 持失切 神獄稽漁)
 
 */

public class C01歯経暗_3腰鯵嬢憩陥_Range {
	public static void main(String[] args) {
		//1. 置企葵聖 古鯵痕呪稽 穿含閤生檎 0~置企葵 耕幻昔 乞窮 葵聖 匂敗馬澗 int壕伸聖 持失馬澗 range五辞球研 幻級嬢左室推.
		//ex. range(10) >> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(Arrays.toString(range(10)));
	
		//今伸稽 閤生檎 畷軒廃 繊戚 
		for(int i : range(10)) {  //壕伸税 葵級聖 馬蟹梢 授辞企稽 襖鎧檎辞 誓遂聖 拝 呪 赤製.
			System.out.println("i : " + i);
		}
		//forEach 庚 : 授辞亜 赤澗 依級聖 馬蟹梢 託景企稽 襖鎧悟 鋼差馬澗 庚狛
		//授辞亜 蒸澗 依級亀 襖馨 呪 赤延 廃汽 益君檎 蟹伸吉 依級戚虞 郊荷洗
		//forEach 庚 : 蟹伸吉 依級聖 馬蟹梢 託景企稽 襖鎧悟 鋼差馬澗 庚狛
		//悦汽 String精 照 鞠革 益君檎 StringBuilder亀 照 鞠形蟹
		for (char c : "ABCD".toCharArray()) {
			System.out.println("c : " + c);
		}
		
		//2. 置社葵引 置企葵聖 古鯵痕呪稽 穿含閤生檎 置社葵採斗 置企葵 耕幻税 乞窮 葵聖 匂敗馬澗 int壕伸聖 持失馬食 鋼発馬澗 range五辞球研 幻級嬢 左室推.
			//range(10, 15) >> [10, 11, 12, 13, 14]
			// 【 range(15, 10)税 衣引 >> [15, 14, 13, 12, 11]
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		
		//3. 置社葵引 置企葵引 装亜葵聖 古鯵痕呪稽 穿含閤生檎 置社葵採斗 置企葵耕幻猿走 装亜葵幻鏑 装亜馬澗 int壕伸聖 持失馬食 鋼発馬澗 range五辞球研 幻級嬢左室推.
			// range(30, 40, 3) >> [30, 33, 35, 39]
			// range(40, 45, 5) >> [40]
			// range(40, 30, -2) >> [40, 38, 36, 34, 32]
		System.out.println(Arrays.toString(range(30, 40, 3)));
		
		
		
		System.out.println(Arrays.toString(range(10, 18, 2)));
		System.out.println(Arrays.toString(range(10, 19, 2)));
		System.out.println(Arrays.toString(range(19, 10, 2))); //食延 null戚 蟹身
		System.out.println(Arrays.toString(range(20, 10, -2)));
		
		
		//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
		//＝＝＝＝＝ばばばばばばばばばばばmyutill醗遂廃 庚薦ばばばばばばばばばばばば＝＝＝＝＝＝＝
		myutil.Range r = new myutil.Range(10, 20);
		//幻鉦拭 myutil 照 帖壱 粛生檎 import背爽檎 喫!
		myutil.Range r2 = new myutil.Range(10, 20);
		myutil.Range r3 = new myutil.Range(-5);
		
		System.out.println(Arrays.toString(r.range));
		System.out.println(Arrays.toString(r2.range));
		System.out.println(Arrays.toString(r3.range));
		//持失切研 幻球澗 疑獣拭 域術戚 陥 掬獄鍵 依
		//＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
	}
	
	
	//1.
	public static int[] range(int end) {
		int[] arr = new int[end];
		for (int num = 0; num < arr.length; ++num) {
			arr[num] = num;
		}
		return arr;
	}
	
	//2.  ×××××××××××× 舛岩坪球 凧壱馬扇 ×××××××××××××
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(start-end)];

			//start葵戚 拙生檎 1梢 装亜馬壱 , start 葵戚 株生檎 1梢 姶社馬亀系 
			int incre = start < end ? 1 : -1;
			
			for (int i = start, index = 0; i != end; i +=incre) {
				//段奄葵拭 砧鯵 戚雌 走舛拝 呪 赤陥 益隈切蟹!! 神神神神神神神神神神神神
				arr[index++] = i;
				//益軒壱 昔畿什研 食奄辞 装亜獣佃爽澗姥蟹 蟹 戚訓 莫殿 切荷 蓋竺嬢辞 照 床澗 依 旭製
			}
		return arr;
	}
	
	//3. ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝生焼焼焼焼焼焼焼た焼焼焼焼＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
	//析舘 壕伸税 掩戚採斗 姥背操醤 馬糠稽 壕伸税 掩戚 姥馬澗 五辞球 幻級奄 
	public static int length(int start, int end, int incre) {
		int diff = end - start;
		//System.out.printf("start : %d, end : %d, incre : %d", start, end, incre);
		
		int length = diff / incre;
		if (length < 0) {
			return 0;	
		}
		length += diff % incre == 0 ? 0 : 1 ;
		//System.out.println("length : " + length);
		return length;
	}
	

	public static int[] range(int start, int end, int incre) {
		//戚闇 暁 畳短 襲惟 熱軒樫................
		//壕伸 掩戚 琶推背辞 length2敗呪 幻糾. 
		int len = length(start, end, incre);
		int[] arr = new int[len];
		
		for(int i = 0; i < len; ++i) {
			arr[i] = start + incre * i;
		}
		return arr;
	}
	
	
	
	
}


	

	
	

	