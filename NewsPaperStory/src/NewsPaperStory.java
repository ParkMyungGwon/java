
public class NewsPaperStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewsPaper paper = new NewsPaper();
		NewsReader reader = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		
		reader.start();
		writer.start();
		
		try{
			reader.join();
			writer.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

class NewsReader extends Thread{
	
	NewsPaper paper;
	
	public NewsReader(NewsPaper paper){
		this.paper = paper;
	}
	
	public void run(){
		System.out.println("������ ���� : " + paper.getTodayNews());
	}
}

class NewsWriter extends Thread{
	
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper){
		this.paper = paper;
	}
	
	public void run(){
		paper.setTodayNews("�ڹ��̤� ���Ⱑ �߷�");
	}
}

class NewsPaper{
	
	String todayNews;
	
	public void setTodayNews(String news){
		todayNews = news;
	}
	
	public String getTodayNews(){
		return todayNews;
	}
}