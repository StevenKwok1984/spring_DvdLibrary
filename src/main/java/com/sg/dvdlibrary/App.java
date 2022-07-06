package src.main.java.com.sg.dvdlibrary;

import src.main.java.com.sg.dvdlibrary.controller.DvdLibraryController;
import src.main.java.com.sg.dvdlibrary.dao.DvdLibraryDao;
import src.main.java.com.sg.dvdlibrary.dao.DvdLibraryDaoException;
import src.main.java.com.sg.dvdlibrary.dao.DvdLibraryDaoFileImpl;
import src.main.java.com.sg.dvdlibrary.ui.DvdLibraryView;
import src.main.java.com.sg.dvdlibrary.ui.UserIO;
import src.main.java.com.sg.dvdlibrary.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) throws DvdLibraryDaoException {
        UserIO myIo = new UserIOConsoleImpl();
        DvdLibraryView myView = new DvdLibraryView(myIo);
        DvdLibraryDao myDao = new DvdLibraryDaoFileImpl();
        DvdLibraryController controller = new DvdLibraryController(myDao, myView);

        controller.run();
    }
}
