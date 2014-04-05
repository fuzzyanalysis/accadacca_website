import org.donkeyenough.Feedback
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_accadaccaWebsite_feedback_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feedback/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: feedbackInstance, field: 'title', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("feedback.title.label"),'default':("Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("title"),'maxlength':("80"),'required':(""),'value':(feedbackInstance?.title)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: feedbackInstance, field: 'feedback', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("feedback.feedback.label"),'default':("Feedback")],-1)
printHtmlPart(2)
invokeTag('textArea','g',19,['name':("feedback"),'cols':("40"),'rows':("5"),'maxlength':("500"),'required':(""),'value':(feedbackInstance?.feedback)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396715495000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
