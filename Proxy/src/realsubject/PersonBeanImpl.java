package realsubject;

import subject.PersonBean;

public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	private int rating = 0;
	private int ratingCount = 0;

	public PersonBeanImpl(String name, String gender, String interests) {
		super();
		this.name = name;
		this.gender = gender;
		this.interests = interests;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public int getHotOrNotRating() {
		if (this.ratingCount == 0) {
			return 0;
		}
		return rating / ratingCount;
	}

	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		this.ratingCount++;
	}

	public int getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}

}
