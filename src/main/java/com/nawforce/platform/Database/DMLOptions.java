/*
 [The "BSD licence"]
 Copyright (c) 2019 Kevin Jones
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.nawforce.platform.Database;

import com.nawforce.platform.System.Boolean;
import com.nawforce.platform.System.Id;
import com.nawforce.platform.System.String;

@SuppressWarnings("unused")
public class DMLOptions {
	public Boolean AllowFieldTruncation;
	public AssignmentRuleHeader AssignmentRuleHeader;
	public DuplicateRuleHeader DuplicateRuleHeader;
	public EmailHeader EmailHeader;
	public String LocaleOptions;
	public Boolean OptAllOrNone;

	public DMLOptions() {throw new java.lang.UnsupportedOperationException();}

	public class AssignmentRuleHeader
	{
		public Id AssignmentRuleId;
		public Boolean UseDefaultRule;

		public AssignmentRuleHeader() {throw new java.lang.UnsupportedOperationException();}
	}

	public class DuplicateRuleHeader
	{
		public Boolean AllowSave;
		public Boolean RunAsCurrentUser;

		public DuplicateRuleHeader() {throw new java.lang.UnsupportedOperationException();}
	}

	public class EmailHeader {
		public Boolean TriggerAutoResponseEmail;
		public Boolean TriggerOtherEmail;
		public Boolean TriggerUserEmail;

		public EmailHeader() {throw new java.lang.UnsupportedOperationException();}
	}
}
