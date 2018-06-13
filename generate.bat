REM Generates Java classes from all lsdl xsds

set xsds[0]=action
set xsds[1]=calculation
set xsds[2]=calendar
set xsds[3]=channel_scan
set xsds[4]=configuration
set xsds[5]=device_description
set xsds[6]=firmware_update
set xsds[7]=mac
set xsds[8]=memory_information
set xsds[9]=network_management
set xsds[10]=partner_information
set xsds[11]=phy
set xsds[12]=public_key
set xsds[13]=service_description
set xsds[14]=statemachine
set xsds[15]=status
set xsds[16]=timer
set xsds[17]=value
set xsds[18]=value_description

for /F "tokens=2 delims==" %%s in ('set xsds[') do (
    xjc.exe -d src\main\java -p com.lemonbeat.lsdl.%%s lsdl_xsd\xsd\%%s.xsd
)