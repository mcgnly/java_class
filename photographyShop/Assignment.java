// What should an Assignment do?
// How do you want to use it for this program?
// You can put any code related to the Assignment class you
// want in here.

//if story starts with int, add to arraylist assignments
//

public class Assignment implements Comparable<Assignment>
{
 
    private int priority;
    public String picDescription;
    public String photogName;

    public Assignment(int priority, String picDescription)
    {
        this.priority = priority;
        this.picDescription = picDescription;
       
    }
    
      public int getPriority()
    {
        return priority;
    }
    
      public String getPicDescription()
    {
        return picDescription;
    }
    
    public void setPhotogName(String photogName)
    {
        this.photogName = photogName;
    }
          /*Comparator for sorting the list by priority no*/
    @Override
    public int compareTo(Assignment comparestu) {
        int comparePrio=((Assignment)comparestu).getPriority();
        /* For Ascending order*/
        return comparePrio-this.priority;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "[ priority=" + priority + ", description=" + picDescription+"]";
    }
}
