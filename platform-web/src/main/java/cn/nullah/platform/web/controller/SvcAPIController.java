package cn.nullah.platform.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zxy@uinpay.cn
 * @note 服务接口控制器
 */
@Controller
@RequestMapping("/svcInfo")
public class SvcAPIController {
	
//	static final Logger logger = LoggerFactory.getLogger(SvcAPIController.class);
//	
//	/** http请求字符集 */
//	private static final String HTTP_REQ_PARAM_CHARSET = "UTF-8";
//	
//	/** 报文分隔符 */
//	private static final String HTTP_SEC_REQ_TEXT_SEPARATOR = ",";
//	
//	/** 3deskey */
//	private static final String plainKey = "11223f588810303828257951cbdd556677297398303036e2";
//	
//	/** 配置类型,请求参数 */
//	public static final Integer CFG_TYPE_REQUEST = 11;
//	
//	/** 配置类型,返回参数 */
//	public static final Integer CFG_TYPE_RESPONSE = 21;
//	
//	@Resource
//	CfgInfoSevice cfgInfoSevice;
//	
//	@RequestMapping("/list")
//	public String toList(Model model){
//		logger.info("xxx");
//		model.addAttribute("title" , "服务接口列表");
//		model.addAttribute("svcList" , cfgInfoSevice.getAll(1));
//		return "svcList";
//	}
//	
//	@RequestMapping("/{id}")
//	public String toSvcDetail(@PathVariable int id , Model model){
//		model.addAttribute("svcInfo" , cfgInfoSevice.getById(id));
//		model.addAttribute("svcParamList" , cfgInfoSevice.getTypeAll(id , CFG_TYPE_REQUEST));
//		return "svcDetail";
//	}
//	
//	@RequestMapping(value = "1" , method = RequestMethod.POST)
//	@ResponseBody
//	public List<CfgInfo> httpSend1(@RequestBody JSONObject param){
//		System.out.println(1);
//		return null;
//	}
//	
//	@RequestMapping(value = "{id}/{companyId}/send" , method = RequestMethod.POST)
//	@ResponseBody
//	public List<CfgInfo> httpSend(@PathVariable int id , @PathVariable String companyId , @RequestBody ReqBaseInfo reqBase){
//		// 加签加密发送
//		String responseCipherStr = send(companyId , reqBase.getUrl() , reqBase.getJsonParamStr());
//		// 返回结果解密
//		if(responseCipherStr.indexOf(HTTP_SEC_REQ_TEXT_SEPARATOR) == -1) throw new RuntimeException("返回参数错误");
//		String plainParamJsonTxt = receive(responseCipherStr.split(HTTP_SEC_REQ_TEXT_SEPARATOR)[1]);
//		// 结果解签解密并返回
//		return pareseRmtReqResult(id , plainParamJsonTxt);
//	}
//	
//	private String receive(String responseParamCipherStr){
//		byte[] jsonParam = ThreeDESUtil.decryptMode(ThreeDESUtil.HexStringToBinary(plainKey) ,
//		    ThreeDESUtil.HexStringToBinary(responseParamCipherStr));
//		try{
//			return jsonParam != null ? new String(jsonParam , HTTP_REQ_PARAM_CHARSET) : "";
//		}catch(UnsupportedEncodingException e){
//			e.printStackTrace();
//			return "";
//		}
//	}
//	
//	@SuppressWarnings("unchecked")
//	private String send(String companyId , String url , String paramJsonStr){
//		// 发送的内容转换json对象
//		JSONObject sendJson = JSONObject.parseObject(paramJsonStr);
//		
//		// reqJson.put("companyid", "16000251"); //test
//		// copy from open core's method
//		Map<String , String> treeMap = JSONObject.parseObject(paramJsonStr , TreeMap.class);;
////		Map<String , String> treeMap = JsonUtils.parserToTreeMap(reqJson.toJSONString());
//		StringBuffer buffer = new StringBuffer(206);
//		Iterator<String> it = treeMap.keySet().iterator();
//		String key = null , value = null;
//		while(it.hasNext()){
//			key = it.next();
//			value = treeMap.get(key);
//			sendJson.put(key , value);
//			buffer.append(key).append("=");
//			if(value != null) buffer.append(value);
//		}
//		String rootPath = this.getClass().getResource("/").getPath();
//		// 签名
//		String signTxt = new RSAUtils(new File(rootPath + "/hsm_pkcs8_rsa_private_key.pem") , new File(rootPath
//		    + "/hsm_public_key_2048.pem")).sign(buffer.toString());
//		// 发送的内容追加签名
//		sendJson.put("sign" , signTxt);
//		byte[] cipherTextBytes = null;
//		try{
//			cipherTextBytes = ThreeDESUtil.encryptMode(ThreeDESUtil.HexStringToBinary(plainKey) ,sendJson.toJSONString().getBytes(HTTP_REQ_PARAM_CHARSET));
//			// 密文
//			String cipherText = ThreeDESUtil.BinaryToHexString(cipherTextBytes);
//			// 加密发送,返回结果
//			return HttpClientUtil.post(url , companyId + HTTP_SEC_REQ_TEXT_SEPARATOR + cipherText);
//		}catch(UnsupportedEncodingException e){
//			e.printStackTrace();
//			throw new RuntimeException("发送异常");
//		}
//	}
//	
//	
//	@SuppressWarnings("unchecked")
//	private List<CfgInfo> pareseRmtReqResult(int configId , String plainParamJsonTxt){
//		// 数据转换map
//		Map<String , String> responseParam = JsonUtils.parserToMap(plainParamJsonTxt);
//		// 获取配置
//		List<CfgInfo> ivkRespList = new ArrayList<CfgInfo>();
//		// 循环返回
//		List<CfgInfo> confList = cfgInfoSevice.getTypeAll(configId , CFG_TYPE_RESPONSE);
//		for(CfgInfo cfgInfo : confList){
//			String fieldName = cfgInfo.getKey();
//			if(responseParam.containsKey(fieldName)){
//				cfgInfo.setValue(responseParam.get(fieldName));
//				// if(fieldName.equals("errorcode")){//查阅属性文件获取编码值
//				// cfgInfo.setRemark("<a>显示编码<a/>");
//				// }
//				ivkRespList.add(cfgInfo);
//			}
//		}
//		return ivkRespList;
//	}
}
