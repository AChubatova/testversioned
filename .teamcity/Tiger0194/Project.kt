package Tiger0194

import Tiger0194.buildTypes.*
import Tiger0194.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0194")
    name = "Tiger0194"

    vcsRoot(Tiger0194_cVCSroot)

    buildType(Tiger0194_Hi0)
    buildType(Tiger0194_Hi1)
    buildType(Tiger0194_Hi2)
    buildType(Tiger0194_Hi3)
})
