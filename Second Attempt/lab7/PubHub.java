public class PubHub{
    public static void main(String[] args){
        BarLocation bar1 = new BarLocation(x1,x2,y1,y2);
        UserLocation user1 = new UserLocation(x,y);
        List<BarLocation> barList = new ArrayList <BarLocation>();
        
        
    public void addUserToBarLocation(User user, Location bar){
            int tempX = UserLocation.currentLocationX(user1);
            int tempY = UserLocation.currentLocationY(user1);
        if(((tempX >= bar.x1) && (tempX <= bar.x2)) && ((tempY >= bar.y1) && (tempY <= bar.y2))){
             user.set(bar);
             barList.add();
            }
    }
    
    public void removeUserToBarLocation(User user){
        int tempX = User.currentLocationX(user1);
        int tempY = User.currentLocationY(user1);
        if((!(tempX >= bar.x1) && !(tempX <= bar.x2)) && (!(tempY >= bar.y1) && !(tempY <= bar.y2))){
        user.set(empty);
        bar.ArrayList(-1);
    }
    
    public void set(BarLocation bar,UserLocation ){
        bar.add();
    }
    
    public void leftBar(Location user){
        
    }
    
    public int currentLocationX(Location user){
        return user.X;
    }
    
    public int currentLocationY(Location user){
        return user.Y;
    }
    
    
}