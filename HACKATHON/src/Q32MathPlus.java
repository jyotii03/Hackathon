//
//public class Q32MathPlus {
//
//	public static void main(String[] args) {
//		public int Neg(int a){
//			int negate=0;
//			int d=(a>0)?-1: 1;
//			while(a!=0){
//			negate+=d;
//			a+=d;
//			}
//			r return negate;
//			}
//
//			public boolean judgesign(int a, int b){
//			return (a>0&&b>0)||(a<0&&b<0)?1:0;
//			}
//
//			public int abs(int a){
//			return (a>0)?a:this.neg(a);
//			}
//
//			*:
//
//			public int multiply(int a, int b){
//			int sum=0;
//			for(int i=0;i<abs(b);i++){
//			sum+=a;
//			}
//			if(this.judgesign(a,b))
//			return sum;
//			else{
//			return this.neg(sum);
//			}
//			}
//
//			
//
//			public int minus(int a, int b){
//			int temp=this.neg(b);
//			return a+temp;
//			}
//
//
//		
//
//			public static int divide(int a, int b) throws java.lang.ArithmeticException{
//			if(b==0)
//			throw new java.lang.ArithmeticException("Divide by 0");
//			if(b>0){
//			int count=0;
//
//			for(int i=abs(a);i>=0;i=i-abs(b)){
//			count++;
//			}
//			if(!judgesign(a,b))
//			count=neg(count);
//			return count;
//			}
//			}
//
//			
//
//	}
//
//}
