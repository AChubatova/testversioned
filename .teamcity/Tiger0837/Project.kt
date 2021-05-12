package Tiger0837

import Tiger0837.buildTypes.*
import Tiger0837.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0837")
    name = "Tiger0837"

    vcsRoot(Tiger0837_cVCSroot)

    buildType(Tiger0837_Hi0)
    buildType(Tiger0837_Hi2)
    buildType(Tiger0837_Hi1)
    buildType(Tiger0837_Hi3)
})
