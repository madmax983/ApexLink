({
	runBackfill : function (component, event, helper) {
		var runBatchAction = component.get("c.executeEthnicityRaceBatch");
		runBatchAction.setCallback(this, function(response) {
	        if(response.getState() === "SUCCESS") {

			    var backfillStatusMsg = component.find("ethnicRaceMsg");
			    $A.util.toggleClass(backfillStatusMsg, "slds-hide");

	        } else if(response.getState() === "ERROR") {
	        	this.displayError(response);
		    }
		});
		$A.enqueueAction(runBatchAction);
	}
})