<%@ page import="org.donkeyenough.Feedback" %>



<div class="fieldcontain ${hasErrors(bean: feedbackInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="feedback.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="80" required="" value="${feedbackInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: feedbackInstance, field: 'feedback', 'error')} required">
	<label for="feedback">
		<g:message code="feedback.feedback.label" default="Feedback" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="feedback" cols="40" rows="5" maxlength="500" required="" value="${feedbackInstance?.feedback}"/>

</div>

