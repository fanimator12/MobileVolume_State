public class Phone
{
  private int volume;
  private AlertState state;
  private final static int MIN_VOLUME = 0;
  private final static int MAX_VOLUME = 10;

  public Phone(){
    this.volume = MIN_VOLUME;
    this.state = new SilentState();
  }

  public void clickSoundButton(){
    state.click(this);
  }

  public void setState(AlertState state){
    this.state = state;
  }

  public void volumeUp()
  {
    if (volume < MAX_VOLUME)
    {
      volume++;
      state.volumeUp(this);
    }
  }

  public void volumeDown(){
    if (volume > MIN_VOLUME)
    {
      volume--;
      state.volumeDown(this);
    }
  }

  public int getVolume(){
    return volume;
  }

  public void setVolume(int volume){
    this.volume = volume;
  }

  public void receive(String message){
    System.out.println(state.alert() + " (" + volume + ") " + message);
  }
}
