package Tiger0033

import Tiger0033.buildTypes.*
import Tiger0033.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0033")
    name = "Tiger0033"

    vcsRoot(Tiger0033_cVCSroot)

    buildType(Tiger0033_Hi3)
    buildType(Tiger0033_Hi2)
    buildType(Tiger0033_Hi1)
    buildType(Tiger0033_Hi0)
})
