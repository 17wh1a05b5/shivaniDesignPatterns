package epamcom.design;

public  abstract class Bike {
	public Bike(Biketype model) {
        this.model = model;
        arrangeParts();
    }
 
    private void arrangeParts() {

    }
 
  
    protected abstract void construct();
 
    private Biketype model = null;
 
    public Biketype getModel() {
        return model;
    }
 
    public void setModel(Biketype model) {
        this.model = model;
    }

	
}
