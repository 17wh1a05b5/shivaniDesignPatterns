package epamcom.behavioural;

public class Students implements Sector {
	  public String[] students = {"Jacob","Lily","John","Ella","George"};

	public Iterator getIterator() {
		return new StudentsIterator();
	}

	private class StudentsIterator implements Iterator {
		  int n;
	      
	      public boolean hasnext() {
	          if(n < students.length) {
	              return true;
	          } 
	          return false;
	      }

	     
	      public Object next() {
	          if(this.hasnext()) {
	              return students[n++];
	          }
	          return null;
	      }
	}
}
