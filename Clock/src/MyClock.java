class MyClock extends Thread {
	
	public MyClock() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCount() {
		return count;
	}

	
	public void setCount(int count) {
		this.count = count;
	}

	private int count;
	
    @Override
    public void run(){
    	int cont = 0;
        try {
            while (cont < this.getCount()) {
            	clearScreen();
                System.out.println(++cont);
                sleep( 1000 );
            }
            this.interrupt();
        }
        catch ( InterruptedException e ) {}
        System.out.println("Stop");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
   }
}