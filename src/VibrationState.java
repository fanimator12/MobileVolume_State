public class VibrationState extends AlertState
{
  @Override public void click(Phone phone)
  {
    phone.setState(new VibrationState());
  }

  @Override public String alert()
  {
    return "BRZZ BRZZ";
  }

}
