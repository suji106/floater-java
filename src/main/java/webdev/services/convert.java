package webdev.services;

public class convert {

	public static void main(String [] args) {
		String inp = "{\r\n" + 
				"        \"maxCount\": {\r\n" + 
				"            \"sink\": 1,\r\n" + 
				"            \"source\": 3,\r\n" + 
				"            \"processor\": 3\r\n" + 
				"        },\r\n" + 
				"        \"Sources\": [{\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"b\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"p\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Sftp\",\r\n" + 
				"            \"type\": \"source\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Ftp\",\r\n" + 
				"            \"type\": \"source\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Jms\",\r\n" + 
				"            \"type\": \"source\"\r\n" + 
				"        }],\r\n" + 
				"        \"Processors\": [{\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"b\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"p\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Splitter\",\r\n" + 
				"            \"type\": \"processor\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Transformer\",\r\n" + 
				"            \"type\": \"processor\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Parser\",\r\n" + 
				"            \"type\": \"processor\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Formatter\",\r\n" + 
				"            \"type\": \"processor\"\r\n" + 
				"        }],\r\n" + 
				"        \"Sinks\": [{\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"b\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"p\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Sftp\",\r\n" + 
				"            \"type\": \"sink\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Ftp\",\r\n" + 
				"            \"type\": \"sink\"\r\n" + 
				"        }, {\r\n" + 
				"            \"settings\": {\r\n" + 
				"                \"abc\": {\r\n" + 
				"                    \"options\": [\"a\", \"b\", \"c\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"inputs\": {\r\n" + 
				"                    \"zzz\": \"\",\r\n" + 
				"                    \"lll\": \"\"\r\n" + 
				"                },\r\n" + 
				"                \"xyz\": {\r\n" + 
				"                    \"options\": [\"p\", \"q\", \"r\"],\r\n" + 
				"                    \"selected\": \"\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"name\": \"Jms\",\r\n" + 
				"            \"type\": \"sink\"\r\n" + 
				"        }]\r\n" + 
				"    }";
		
		System.out.println(inp.replaceAll("\\s+", ""));
	}
}
