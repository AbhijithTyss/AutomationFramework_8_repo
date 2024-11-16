package chithra;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class GitHubFork {
	@Test
	public void forkAndPullRequest() {
		Reporter.log("Added ForkAndPullRequest testcase",true);
	}
}
