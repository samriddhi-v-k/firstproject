class Candidate
{
static String candidateName ="sam";
static	String  gender = " female";
static	String  dob ="17/07/2003";
static	int age = 21;
static	String address = "#284,7th main,ravi kirloskar layout";
static	long aadharNumber = 123443215678L;
static	String panNo =  "abcde1234t";
static	String sports = "volleyball,basketball,throwball,chess";
static	String series = "kdrama,cdrama,movies";
static	String favSinger = "arijit singh";
static	Boolean isalive = true;
static	String bloodGroup = "O+";
	public static void main(String candidate[])
	{
	 
		System.out.println("the candidateName is" +candidateName);
		System.out.println("the candidate gender is " +gender);
		System.out.println("the candidate dob is " +dob);
		System.out.println("the candidate age  is " + age);
		System.out.println("the candidateName address" +address);
		System.out.println("the candidate aadharNumberis " +aadharNumber);
		System.out.println("the candidate panNo is " +panNo);
		System.out.println("the candidate sports  is " + sports);
		System.out.println("the candidate fav series is" +series);
		System.out.println("the candidate fav singer is " +favSinger);
		System.out.println("the candidate is alive " +isalive);
		System.out.println("the candidate blodd group is " +bloodGroup);
		candidateName ="sammy";
		gender = " male";
		dob ="18/07/2002";
		age = 20;
		address = "#290,7th main,ravi kirloskar layout";
		aadharNumber = 444443215678L;
		panNo =  "eidjd1234t";
		sports = "basketball";
		series = "ott";
		favSinger = "shawn mendes";
		isalive = true;
		bloodGroup = "AB";
		Candidate.update();
		System.out.println("the candidateName is" +candidateName);
		System.out.println("the candidate gender is " +gender);
		System.out.println("the candidate dob is " +dob);
		System.out.println("the candidate age  is " + age);
		System.out.println("the candidateName address" +address);
		System.out.println("the candidate aadharNumberis " +aadharNumber);
		System.out.println("the candidate panNo is " +panNo);
		System.out.println("the candidate sports  is " + sports);
		System.out.println("the candidate fav series is" +series);
		System.out.println("the candidate fav singer is " +favSinger);
		System.out.println("the candidate is alive " +isalive);
		System.out.println("the candidate blodd group is " +bloodGroup);
	}
	public static void update()
	{
		candidateName ="sammy";
		gender = " male";
		dob ="18/07/2002";
		age = 20;
		address = "#290,7th main,ravi kirloskar layout";
		aadharNumber = 444443215678L;
		panNo =  "eidjd1234t";
		sports = "basketball";
		series = "ott";
		favSinger = "shawn mendes";
		isalive = true;
		bloodGroup = "AB";
	}
}