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
package com.nawforce.platform.SObjects;

import com.nawforce.platform.System.Integer;
import com.nawforce.platform.System.String;
import com.nawforce.platform.System.*;


@SuppressWarnings("unused")
public class BackgroundOperation extends SObject {
	public String CurrencyIsoCode;
	public String Error;
	public String ExecutionGroup;
	public Datetime ExpiresAt;
	public Datetime FinishedAt;
	public Id GroupLeaderId;
	public BackgroundOperation GroupLeader;
	public String Name;
	public com.nawforce.platform.System.Integer NumFollowers;
	public String ParentKey;
	public Datetime ProcessAfter;
	public com.nawforce.platform.System.Integer RetryBackoff;
	public com.nawforce.platform.System.Integer RetryCount;
	public com.nawforce.platform.System.Integer RetryLimit;
	public String SequenceGroup;
	public com.nawforce.platform.System.Integer SequenceNumber;
	public Datetime StartedAt;
	public String Status;
	public Datetime SubmittedAt;
	public Integer Timeout;
	public String WorkerUri;

	public BackgroundOperation MergedOperations;
}
