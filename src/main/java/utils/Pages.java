package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.iframe.NestedIframe_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.selectable.Selectable_DefFunc_Page;

public class Pages {

    private AutoScrolling_Page autoScrollingPage;

    private ConstrainMovement_Page constrainMovementPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;


    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;
    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        constrainMovementPage = new ConstrainMovement_Page();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage(){
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage(){
        return selectableDefFuncPage;
    }

    public ConstrainMovement_Page getConstrainMovementPage(){
        return constrainMovementPage;
    }
}
