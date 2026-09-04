package com.streampract2;

public class Branch {
	
	int branchId;
	
	String branchName;
	

	public Branch() {
		super();
	}

	public Branch(int branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
}
