import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForPageLoad(20)

for (def row = 1; row <= findTestData('createMaterialRequisitionData/createMrInfo').getRowNumbers(); row++) {
    'Delay 1 second'
    WebUI.delay(2)

    'Mouse Hover On Requisition Menu'
    WebUI.mouseOver(findTestObject('create material requisition/span_Requisitions'))

    WebUI.delay(2)

    'Mouse Hover On Create Requisition Sub Menu'
    WebUiBuiltInKeywords.mouseOver(findTestObject('create material requisition/a_Create Requisition'))

    WebUI.delay(2)

    'Mouse Hover On Create Material Requisition Sub Sub-Menu'
    WebUI.mouseOver(findTestObject('create material requisition/a_Material Requisition'))

    WebUI.delay(2)

    WebUI.takeScreenshot()

    'Click On Create Material Requisition'
    WebUI.click(findTestObject('create material requisition/a_Material Requisition'))

    'Input Material Requisition Name'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_requisitionTitle'), findTestData('createMaterialRequisitionData/createMrInfo').getValue(
            'Requisition Title *', row))

    WebUI.click(findTestObject('Page_Procurement Management  Create/requestTo'))

    'Click Material Requisition Request To Field'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/requestTo'), findTestData('createMaterialRequisitionData/createMrInfo').getValue(
            'Request To *', row))

    'Select Material Requisition Request To Field'
    WebUI.click(findTestObject('Page_Procurement Management  Create/selectRequestTo_1stOption'))

    'Input Receiver Name'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_receiverName'), findTestData('createMaterialRequisitionData/createMrInfo').getValue(
            'Receiver *', row))

    'Select Receiver'
    WebUI.click(findTestObject('Page_Procurement Management  Create/li_Fahad Billah'))

    WebUI.delay(2)

    'Input orginal Requester'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_originalRequesterName (2)'), findTestData('createMaterialRequisitionData/createMrInfo').getValue(
            'Original Requester Name', row))

    'Input Phone Number'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_originalRequesterPhone (1)'), findTestData('createMaterialRequisitionData/createMrInfo').getValue(
            'Phone Number', row))

    'Input Remarks'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/textarea_remarks'), findTestData('createMaterialRequisitionData/createMrInfo').getValue(
            'Remarks', row))

    WebUiBuiltInKeywords.delay(1)

    'Click On Item Details'
    WebUI.click(findTestObject('Page_Procurement Management  Create/span_Item Details'))

    WebUI.delay(1)

    'scroll to web element'
    WebUI.scrollToElement(findTestObject('Page_Procurement Management  Create/span_Item Details'), 5)

    'Click CC Filed'
    WebUI.click(findTestObject('Page_Procurement Management  Create/CostCenterName'))

    WebUI.waitForAngularLoad(30)

    'Select CC Name'
    WebUI.click(findTestObject('Page_Procurement Management  Create/a_10100.12 Engineers  Employer'))

    WebUI.delay(1)

    'Click OK Button'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_OK'))

    WebUI.delay(2)

    'Click Item Field'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_btn pull-right btn-defa'))

    WebUI.waitForAngularLoad(40)

    'Search Item'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_form-control ng-untouche'), 'acv')

    WebUI.delay(2)

    'Selet Item'
    WebUI.click(findTestObject('Page_Procurement Management  Create/a_ACV Measuring Mould'))

    WebUI.delay(2)

    'Click Ok button'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_OK'))

    WebUI.waitForAngularLoad(5)

    WebUI.click(findTestObject('Page_Procurement Management  Create/Click specification ID'))

    WebUI.delay(1)

    'Select Item Specification "Spec 2"'
    WebUI.click(findTestObject('Page_Procurement Management  Create/select_specificationId'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Page_Procurement Management  Create/Click Size ID'))

    WebUI.delay(1)

    'Select Item Size "Size 2"'
    WebUI.click(findTestObject('Page_Procurement Management  Create/select_sizeId'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Page_Procurement Management  Create/click color Id'))

    WebUI.delay(1)

    'Select item Color "Color 1"'
    WebUI.click(findTestObject('Page_Procurement Management  Create/select_colorId'))

    'Input Receiver Name'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_receiverNameTemp'), 'mkGhost')

    'Input Receiver Address'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_receivingAddress'), '20no road mohakhali DOHS')

    'Input Item Qty'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_quantity'), '250')

    'Input Item Description'
    WebUI.setText(findTestObject('Page_Procurement Management  Create/input_itemDesc'), 'Test Item')

    WebUI.delay(1)

    'Click Add Item Button'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_Add Item'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Page_Procurement Management  Create/button_Submit'), 5)

    'Click Submit Button'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_Submit'))

    WebUI.delay(1)

    'Click Cancel PopUp Button'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_Cancel'))

    WebUI.delay(1)

    'Click Submit Button'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_Submit (1)'))

    WebUI.delay(1)

    'Click Ok Button PopUp'
    WebUI.click(findTestObject('Page_Procurement Management  Create/button_Submit_popUp'))

    WebUI.verifyTextPresent('Requisition Created Successfully', false)

    'Click Ok Button'
    WebUI.click(findTestObject('Page_Procurement Management  Create (1)/ok_btn'))
}

