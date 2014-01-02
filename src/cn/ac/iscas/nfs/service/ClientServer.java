package cn.ac.iscas.nfs.service;

import java.util.ArrayList;
import java.util.List;


public class ClientServer {

	public static void main(String[] args) {
		ServiceImpl factory = new ServiceImpl();
		ServiceInterface siIns = factory.getServiceImplPort();
		
		siIns.createBugReqRel("Bugzilla", "81", "Jira", "NFSPLAT-73");
		siIns.createBugReqRel("Bugzilla", "81", "Jira", "NFSPLAT-71");
		siIns.createBugReqRel("Bugzilla", "81", "Jira", "NFSPLAT-72");

		List<String> bugList = new ArrayList<String>();
		List<String> reqList = new ArrayList<String>();
		
		bugList = siIns.getBugIdByReq("Jira", "NFSPLAT-70", "Bugzilla");
		reqList = siIns.getReqIdByBug("Bugzilla", "bug_0", "Jira");
		
		System.out.println("bugList:");
		for(int i=0; i<bugList.size(); i++)
		{
			System.out.print(bugList.get(i)+"\n");
		}
		
		System.out.println("\nreqList:");
		for(int i=0; i<reqList.size(); i++)
		{
			System.out.print(reqList.get(i)+"\n");
		}
	}

}
