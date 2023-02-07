package assig2;

import java.io.File;
import java.util.Arrays;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ListBranchCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.lib.Ref;

public class model {
    /**
     * Method for cloning the specific branch from GitHub.
     * @params Takes the URI of the repo and the name of the branch to be cloned.
     * @returns Returns a string giving a success or fail message.
     */
    public static void cloneRepo(String URI, String branch) throws TransportException, InvalidRemoteException, GitAPIException {
        Git r = Git.cloneRepository()
                .setURI(URI)
                //.setDirectory(new File("")) return status info, "clone failed because uri is not valid"
                .setBranchesToClone(Arrays.asList("refs/heads/" + branch))
                .setBranch("refs/heads/" + branch)
                .call();
    }

    public static void deleteRepo(){

    }

}
