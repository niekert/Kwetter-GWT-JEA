package nl.fontys.fhict.jea.gwt.jee7.client.koch;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class KochView_KochViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView>, nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView.KochViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView owner;


    public Widgets(final nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_levelField();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenBundle) GWT.create(nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final nl.fontys.fhict.jea.gwt.jee7.client.koch.KochView_KochViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      f_HTMLPanel1.setWidth("800px");
      f_HTMLPanel1.setHeight("820px");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord0.detach();
      f_HTMLPanel1.addAndReplaceElement(get_canvasPlaceholder(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel2(), get_domId1Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for canvasPlaceholder called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_canvasPlaceholder() {
      return build_canvasPlaceholder();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_canvasPlaceholder() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel canvasPlaceholder = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      canvasPlaceholder.setWidth("800px");
      canvasPlaceholder.setHeight("800px");


      this.owner.canvasPlaceholder = canvasPlaceholder;

      return canvasPlaceholder;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel2.add(get_decreaseButton());
      f_HorizontalPanel2.add(get_levelField());
      f_HorizontalPanel2.setCellHorizontalAlignment(get_levelField(), com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_RIGHT);
      f_HorizontalPanel2.add(get_increaseButton());
      f_HorizontalPanel2.add(get_calculateButton());
      f_HorizontalPanel2.setBorderWidth(2);
      f_HorizontalPanel2.setWidth("20px");
      f_HorizontalPanel2.setHeight("20px");


      return f_HorizontalPanel2;
    }

    /**
     * Getter for decreaseButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PushButton get_decreaseButton() {
      return build_decreaseButton();
    }
    private com.google.gwt.user.client.ui.PushButton build_decreaseButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.PushButton decreaseButton = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
      // Setup section.
      decreaseButton.setWidth("10px");
      decreaseButton.setText("<");
      decreaseButton.setHeight("18px");


      this.owner.decreaseButton = decreaseButton;

      return decreaseButton;
    }

    /**
     * Getter for levelField called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.IntegerBox levelField;
    private com.google.gwt.user.client.ui.IntegerBox get_levelField() {
      return levelField;
    }
    private com.google.gwt.user.client.ui.IntegerBox build_levelField() {
      // Creation section.
      levelField = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
      // Setup section.
      levelField.setWidth("18px");
      levelField.setReadOnly(true);
      levelField.setAlignment(com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment.RIGHT);
      levelField.setValue(1);
      levelField.setHeight("18px");


      this.owner.levelField = levelField;

      return levelField;
    }

    /**
     * Getter for increaseButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PushButton get_increaseButton() {
      return build_increaseButton();
    }
    private com.google.gwt.user.client.ui.PushButton build_increaseButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.PushButton increaseButton = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
      // Setup section.
      increaseButton.setWidth("10px");
      increaseButton.setText(">");
      increaseButton.setHeight("18px");


      this.owner.increaseButton = increaseButton;

      return increaseButton;
    }

    /**
     * Getter for calculateButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.PushButton get_calculateButton() {
      return build_calculateButton();
    }
    private com.google.gwt.user.client.ui.PushButton build_calculateButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.PushButton calculateButton = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
      // Setup section.
      calculateButton.setWidth("59px");
      calculateButton.setText("Calculate");
      calculateButton.setHeight("18px");


      this.owner.calculateButton = calculateButton;

      return calculateButton;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }
  }
}
