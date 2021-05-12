package Tiger0532

import Tiger0532.buildTypes.*
import Tiger0532.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0532")
    name = "Tiger0532"

    vcsRoot(Tiger0532_cVCSroot)

    buildType(Tiger0532_Hi0)
    buildType(Tiger0532_Hi1)
    buildType(Tiger0532_Hi2)
    buildType(Tiger0532_Hi3)
})
