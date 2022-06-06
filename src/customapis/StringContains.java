package customapis;


import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.TestApi;
import com.provar.core.testapi.annotations.TestApiExecutor;
import com.provar.core.testapi.annotations.TestApiParameter;
import com.provar.core.testapi.annotations.TestApiParameterGroup;
import com.provar.core.testapi.annotations.TestApiParameterGroups;
import com.provar.core.testapi.annotations.TestExecutionContext;
import com.provar.core.testapi.annotations.TestLogger;

@TestApi( title="String Contains"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"Custom"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class StringContains {
    
    @TestApiParameter(seq=1, 
            summary="Original String",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public String param1;
    
    @TestApiParameter(seq=2, 
            summary="String for comparison",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public String param2;

    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test Case")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
	@TestApiExecutor
	public void execute() {

		// Put our implementation logic here.
		testLogger.info("Input 1:" + param1);
		testLogger.info("Input 2:" + param2);

		/*// Logic to find exact match
		
	
		String[] splitted = param1.split("\\s+");
		Boolean Result = false;
		Result = Arrays.asList(splitted).contains(param2);
		testLogger.info("Result:" + Result);
*/
		String Result = Boolean.toString(param1.contains(param2));
		testLogger.info("Result:" + Result);

		testExecutionContext.setValue(resultName, Result, resultScope);

	}
	

}
