package spring_mybatis;


public class Tests {

	public static void main(String[] args) {
		String[] arr = new String[20];
	}
}

class link{
	
	private node node;
	
	public void add(Object obj){
		if(this.node==null){
			this.node = new node();
		}
		this.node.add(obj,this.node);
		
	}
	
	class node{
		private Object object;

		public Object getObject() {
			return object;
		}
		public void setObject(Object object) {
			this.object = object;
		}
		
		public void add(Object obj,node node){
			if(this.object==null){
				this.object = obj;
			}else{
				node.object = obj;
			}
			
		}
		
	}
}