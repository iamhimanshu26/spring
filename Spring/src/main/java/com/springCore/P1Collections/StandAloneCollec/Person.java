package com.springCore.P1Collections.StandAloneCollec;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStruc;
	private Properties props;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStruc() {
		return feeStruc;
	}

	public void setFeeStruc(Map<String, Integer> feeStruc) {
		this.feeStruc = feeStruc;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStruc=" + feeStruc + ", props=" + props + "]";
	}

}
